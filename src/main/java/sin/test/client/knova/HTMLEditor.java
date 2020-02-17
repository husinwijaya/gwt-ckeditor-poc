package sin.test.client.knova;

import com.axeiya.gwtckeditor.client.CKConfig;
import com.smartgwt.client.widgets.Canvas;
import com.smartgwt.client.widgets.layout.VLayout;

/**
 * 
 * @author Rajkumar.Annadurai
 * 
 */
public class HTMLEditor extends VLayout {

	private CKEditorExtended editor;

	private String editorId;


	public HTMLEditor() {
		
		createEditor(CKConfig.full,null);
	}

	public HTMLEditor(CKEditorConfig config,String userId) {
		
		createEditor(config,userId);
	}

	private void createEditor(CKConfig config,String userId){
		config.setUseFormPanel(false);
		config.setBaseFloatZIndex(1000000);
		config.setResizeEnabled(false);
		
		config.setFileBrowserBrowseUrl("/commontools/MediaManager.html?type=media&userid="+userId+"");
		config.setFileBrowserImageBrowseLinkUrl("/commontools/MediaManager.html?type=image&userid="+userId+"");
		config.setFileBrowserImageBrowseUrl("/commontools/MediaManager.html?type=image&userid="+userId+"");
		config.setEntities(false);
		Canvas canvas = new Canvas();
		editor = new CKEditorExtended(config);
		editor.setSize("100%", "100%");
		canvas.addChild(editor);
		canvas.setSize("100%", "100%");
		setSize("100%", "90%");
		
		addMember(canvas);
	}
	public void setHTMLContent(String content) {
		editor.setHTML(content);
	}

	public String getHTMLContent() {
		return editor.getHTML();
	}

	public String getEditorId() {
		return editorId;
	}

	public void setEditorId(String editorId) {
		this.editorId = editorId;
	}

	public void setLayoutId(String layoutId) {
		setID(layoutId);
	}
	
	public void setDisableEditor(boolean disabled){
		this.editor.setDisabled(disabled);
	}
	
	public boolean isContentChanged(){		
		return this.editor.checkDirty();
	}
}
