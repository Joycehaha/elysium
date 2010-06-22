package org.elysium.ui;

import org.eclipse.jface.text.IAutoEditStrategy;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.resource.containers.IAllContainersState;
import org.eclipse.xtext.ui.editor.IXtextEditorCallback;
import org.eclipse.xtext.ui.editor.hyperlinking.IHyperlinkHelper;
import org.eclipse.xtext.ui.editor.model.IResourceForEditorInputFactory;
import org.eclipse.xtext.ui.editor.model.ResourceForIEditorInputFactory;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.eclipse.xtext.ui.editor.syntaxcoloring.antlr.AbstractAntlrTokenToAttributeIdMapper;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;
import org.eclipse.xtext.ui.resource.SimpleResourceSetProvider;
import org.eclipse.xtext.ui.shared.Access;
import org.elysium.ui.autoedit.LilyPondAutoEditStrategy;
import org.elysium.ui.hyperlinks.LilyPondHyperlinkHelper;
import org.elysium.ui.syntaxcoloring.LilyPondAntlrTokenToAttributeIdMapper;
import org.elysium.ui.syntaxcoloring.LilyPondHighlightingConfiguration;
import org.elysium.ui.syntaxcoloring.LilyPondSemanticHighlightingCalculator;
import com.google.inject.Binder;
import com.google.inject.Provider;
import com.google.inject.name.Names;

/**
 * Registers UI components to be used within the LilyPond IDE.
 */
public class LilyPondUiModule extends AbstractLilyPondUiModule {

	public LilyPondUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	@Override
	public void configure(Binder binder) {
		super.configure(binder);
		// Icon path
		binder.bind(String.class).annotatedWith(Names.named("org.eclipse.xtext.ui.PluginImageHelper.pathSuffix")).toInstance("icons/nodes/"); //$NON-NLS-1$ //$NON-NLS-2$
		// Auto edit
		binder.bind(IAutoEditStrategy.class).to(LilyPondAutoEditStrategy.class);
		// Hyperlinks
		binder.bind(IHyperlinkHelper.class).to(LilyPondHyperlinkHelper.class);
		// Syntax coloring
		binder.bind(IHighlightingConfiguration.class).to(LilyPondHighlightingConfiguration.class);
		binder.bind(AbstractAntlrTokenToAttributeIdMapper.class).to(LilyPondAntlrTokenToAttributeIdMapper.class);
		binder.bind(ISemanticHighlightingCalculator.class).to(LilyPondSemanticHighlightingCalculator.class);
	}

	@Override
	public Class<? extends IXtextEditorCallback> bindIXtextEditorCallback() {
		return LilyPondEditorCallback.class;
	}

	// Avoid dependency on JDT

	@Override
	public Class<? extends IResourceForEditorInputFactory> bindIResourceForEditorInputFactory() {
		return ResourceForIEditorInputFactory.class;
	}

	@Override
	public Class<? extends IResourceSetProvider> bindIResourceSetProvider() {
		return SimpleResourceSetProvider.class;
	}

	@Override
	public Provider<IAllContainersState> provideIAllContainersState() {
		return Access.getWorkspaceProjectsState();
	}

}