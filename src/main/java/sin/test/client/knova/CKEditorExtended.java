package sin.test.client.knova;

import com.axeiya.gwtckeditor.client.CKConfig;
import com.axeiya.gwtckeditor.client.CKEditor;

public class CKEditorExtended extends CKEditor {
	
	public CKEditorExtended (CKConfig config) {
		super(config);
	}
	
	public native boolean checkDirty()/*-{
	  var editor = this.@com.axeiya.gwtckeditor.client.CKEditor::editor;
	  if(editor){
	   return editor.checkDirty();
	  }
	 }-*/;
}
