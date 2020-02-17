package sin.test.client.knova;

import com.axeiya.gwtckeditor.client.CKConfig;
import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.LocaleInfo;

/**
 * 
 * @author Rajkumar.Annadurai
 *
 */
public class CKEditorConfig extends CKConfig{

	/**
	 * Default Authoring configuration
	 */
	public static CKEditorConfig authoringConfig = new CKEditorConfig("Authoring");

	/**
	 * Default Community configuration
	 */
	public static CKEditorConfig communityConfig = new CKEditorConfig("Community");

	/**
	 * Default Resolution Workbench configuration
	 */
	public static CKEditorConfig ResolutionWBConfig = new CKEditorConfig("ResolutionFlowDesigner");

	/**
	 * Default Community configuration
	 */
	public static CKEditorConfig ResolutionDesignerConfig = new CKEditorConfig("ResolutionWorkbench");
	
	
	public CKEditorConfig(String toolbar) {
		setToolbarName(toolbar);
		LocaleInfo l = LocaleInfo.getCurrentLocale();
		
		if (l.getLocaleName().equals("default")) {
			GWT.log("LocaleProperty : " + getLocale(), null);
			this.setLanguage(getLocale());
		} 
		else
		{
			this.setLanguage(getLocale());
		}
	}

	private native String getLocale() /*-{
	        if ($wnd.__gwt_Locale)
	               return $wnd.__gwt_Locale;
	        return "en";
	 }-*/;

}
