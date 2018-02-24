package org.elysium.tests.importuri;

import org.elysium.importuri.LilyPondImportUriResolver;
import org.junit.Assert;
import org.junit.Test;

import com.google.common.base.Optional;

//TODO find a way to allow these tests to run system independent
public class ImportUriResolverTest {

	private boolean isWindows=Optional.fromNullable(System.getProperty("os.name")).or("another").toLowerCase().contains("win");//$NON-NLS-1$//$NON-NLS-2$//$NON-NLS-3$

	@Test
	public void testAbsolute() {
		checkIsAbsolute("", false);
		checkIsAbsolute("file.ly", false);
		checkIsAbsolute("folder/file.ly", false);
		checkIsAbsolute("../file.ly", false);
		checkIsAbsolute("../otherFolder/file.ly", false);

		
		if(isWindows) {
			checkIsAbsolute("c:/windowsfolder/file.ly", true);
			checkIsAbsolute("c:\\windowsfolder\\file.ly", true);
			checkIsAbsolute("c:\\\\windowsfolder\\\\file.ly", true);
		}else {
			checkIsAbsolute("/file.ly", true);
			checkIsAbsolute("/unixfolder/file.ly", true);
		}
	}

	private void checkIsAbsolute(String includeString, boolean expectedAbsolute) {
		Assert.assertEquals(expectedAbsolute, LilyPondImportUriResolver.isAbsolute(includeString));
	}
}
