/**
 * <copyright>
 * </copyright>
 *
 */
package org.elysium.lilypond.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.elysium.lilypond.Assignment;
import org.elysium.lilypond.Block;
import org.elysium.lilypond.Command;
import org.elysium.lilypond.CommonExpression;
import org.elysium.lilypond.Expression;
import org.elysium.lilypond.Include;
import org.elysium.lilypond.LilyPond;
import org.elysium.lilypond.LilypondFactory;
import org.elysium.lilypond.LilypondPackage;
import org.elysium.lilypond.Markup;
import org.elysium.lilypond.MarkupBlock;
import org.elysium.lilypond.MarkupCommand;
import org.elysium.lilypond.MarkupExpression;
import org.elysium.lilypond.PropertyAssignment;
import org.elysium.lilypond.Reference;
import org.elysium.lilypond.Scheme;
import org.elysium.lilypond.SchemeBlock;
import org.elysium.lilypond.SchemeBoolean;
import org.elysium.lilypond.SchemeCharacter;
import org.elysium.lilypond.SchemeExpression;
import org.elysium.lilypond.SchemeList;
import org.elysium.lilypond.SchemeMarkupCommand;
import org.elysium.lilypond.SchemeNumber;
import org.elysium.lilypond.SchemeText;
import org.elysium.lilypond.SchemeValue;
import org.elysium.lilypond.SimpleBlock;
import org.elysium.lilypond.SimultaneousBlock;
import org.elysium.lilypond.SpecialCommand;
import org.elysium.lilypond.Text;
import org.elysium.lilypond.ToplevelExpression;
import org.elysium.lilypond.Version;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LilypondFactoryImpl extends EFactoryImpl implements LilypondFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LilypondFactory init()
  {
    try
    {
      LilypondFactory theLilypondFactory = (LilypondFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.elysium.org/LilyPond"); 
      if (theLilypondFactory != null)
      {
        return theLilypondFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new LilypondFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LilypondFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case LilypondPackage.LILY_POND: return createLilyPond();
      case LilypondPackage.TOPLEVEL_EXPRESSION: return createToplevelExpression();
      case LilypondPackage.EXPRESSION: return createExpression();
      case LilypondPackage.COMMON_EXPRESSION: return createCommonExpression();
      case LilypondPackage.ASSIGNMENT: return createAssignment();
      case LilypondPackage.PROPERTY_ASSIGNMENT: return createPropertyAssignment();
      case LilypondPackage.BLOCK: return createBlock();
      case LilypondPackage.SIMPLE_BLOCK: return createSimpleBlock();
      case LilypondPackage.SIMULTANEOUS_BLOCK: return createSimultaneousBlock();
      case LilypondPackage.COMMAND: return createCommand();
      case LilypondPackage.SPECIAL_COMMAND: return createSpecialCommand();
      case LilypondPackage.INCLUDE: return createInclude();
      case LilypondPackage.VERSION: return createVersion();
      case LilypondPackage.MARKUP: return createMarkup();
      case LilypondPackage.MARKUP_BLOCK: return createMarkupBlock();
      case LilypondPackage.MARKUP_EXPRESSION: return createMarkupExpression();
      case LilypondPackage.MARKUP_COMMAND: return createMarkupCommand();
      case LilypondPackage.REFERENCE: return createReference();
      case LilypondPackage.TEXT: return createText();
      case LilypondPackage.NUMBER: return createNumber();
      case LilypondPackage.SCHEME: return createScheme();
      case LilypondPackage.SCHEME_EXPRESSION: return createSchemeExpression();
      case LilypondPackage.SCHEME_VALUE: return createSchemeValue();
      case LilypondPackage.SCHEME_BOOLEAN: return createSchemeBoolean();
      case LilypondPackage.SCHEME_LIST: return createSchemeList();
      case LilypondPackage.SCHEME_BLOCK: return createSchemeBlock();
      case LilypondPackage.SCHEME_CHARACTER: return createSchemeCharacter();
      case LilypondPackage.SCHEME_TEXT: return createSchemeText();
      case LilypondPackage.SCHEME_NUMBER: return createSchemeNumber();
      case LilypondPackage.SCHEME_MARKUP_COMMAND: return createSchemeMarkupCommand();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LilyPond createLilyPond()
  {
    LilyPondImpl lilyPond = new LilyPondImpl();
    return lilyPond;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ToplevelExpression createToplevelExpression()
  {
    ToplevelExpressionImpl toplevelExpression = new ToplevelExpressionImpl();
    return toplevelExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CommonExpression createCommonExpression()
  {
    CommonExpressionImpl commonExpression = new CommonExpressionImpl();
    return commonExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assignment createAssignment()
  {
    AssignmentImpl assignment = new AssignmentImpl();
    return assignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyAssignment createPropertyAssignment()
  {
    PropertyAssignmentImpl propertyAssignment = new PropertyAssignmentImpl();
    return propertyAssignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block createBlock()
  {
    BlockImpl block = new BlockImpl();
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleBlock createSimpleBlock()
  {
    SimpleBlockImpl simpleBlock = new SimpleBlockImpl();
    return simpleBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimultaneousBlock createSimultaneousBlock()
  {
    SimultaneousBlockImpl simultaneousBlock = new SimultaneousBlockImpl();
    return simultaneousBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Command createCommand()
  {
    CommandImpl command = new CommandImpl();
    return command;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpecialCommand createSpecialCommand()
  {
    SpecialCommandImpl specialCommand = new SpecialCommandImpl();
    return specialCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Include createInclude()
  {
    IncludeImpl include = new IncludeImpl();
    return include;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Version createVersion()
  {
    VersionImpl version = new VersionImpl();
    return version;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Markup createMarkup()
  {
    MarkupImpl markup = new MarkupImpl();
    return markup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MarkupBlock createMarkupBlock()
  {
    MarkupBlockImpl markupBlock = new MarkupBlockImpl();
    return markupBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MarkupExpression createMarkupExpression()
  {
    MarkupExpressionImpl markupExpression = new MarkupExpressionImpl();
    return markupExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MarkupCommand createMarkupCommand()
  {
    MarkupCommandImpl markupCommand = new MarkupCommandImpl();
    return markupCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Reference createReference()
  {
    ReferenceImpl reference = new ReferenceImpl();
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Text createText()
  {
    TextImpl text = new TextImpl();
    return text;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.elysium.lilypond.Number createNumber()
  {
    NumberImpl number = new NumberImpl();
    return number;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Scheme createScheme()
  {
    SchemeImpl scheme = new SchemeImpl();
    return scheme;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SchemeExpression createSchemeExpression()
  {
    SchemeExpressionImpl schemeExpression = new SchemeExpressionImpl();
    return schemeExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SchemeValue createSchemeValue()
  {
    SchemeValueImpl schemeValue = new SchemeValueImpl();
    return schemeValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SchemeBoolean createSchemeBoolean()
  {
    SchemeBooleanImpl schemeBoolean = new SchemeBooleanImpl();
    return schemeBoolean;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SchemeList createSchemeList()
  {
    SchemeListImpl schemeList = new SchemeListImpl();
    return schemeList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SchemeBlock createSchemeBlock()
  {
    SchemeBlockImpl schemeBlock = new SchemeBlockImpl();
    return schemeBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SchemeCharacter createSchemeCharacter()
  {
    SchemeCharacterImpl schemeCharacter = new SchemeCharacterImpl();
    return schemeCharacter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SchemeText createSchemeText()
  {
    SchemeTextImpl schemeText = new SchemeTextImpl();
    return schemeText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SchemeNumber createSchemeNumber()
  {
    SchemeNumberImpl schemeNumber = new SchemeNumberImpl();
    return schemeNumber;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SchemeMarkupCommand createSchemeMarkupCommand()
  {
    SchemeMarkupCommandImpl schemeMarkupCommand = new SchemeMarkupCommandImpl();
    return schemeMarkupCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LilypondPackage getLilypondPackage()
  {
    return (LilypondPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static LilypondPackage getPackage()
  {
    return LilypondPackage.eINSTANCE;
  }

} //LilypondFactoryImpl
