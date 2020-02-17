package sin.test.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import sin.test.client.knova.CKEditorConfig;
import sin.test.client.knova.HTMLEditor;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Main implements EntryPoint {

    public static final String FULL = "1000px";

    @Override
    public void onModuleLoad() {

        RootPanel.get("main").add(new HTMLEditor());
    }
}
