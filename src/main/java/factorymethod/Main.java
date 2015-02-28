package factorymethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Factory Method模式在一個抽象類別中留下某個建立元件的抽象方法沒有實作，其它與元件操作相關聯的方法都先依賴於元件所定義的介面，
 * 而不是依賴於元件的實 現， 當您的成品中有一個或多個元件無法確定時，
 * 您先確定與這些元件的操作介面，然後用元件的抽象操作介面先完成其它的工作，元件的實作（實現）則推遲至實現元 件介面的子類完成，
 * 一旦元件加入，即可完成您的成品。

 簡單地說，如果您希望如何建立父類別中用到的物件這件事，是由子類別來決定，可以使用 Factory Method。

 舉一個例子，假設您要完成一個文件編輯器，您希望這個編輯器可以適用於所有類型的檔案編輯，
 例如RTF、DOC、TXT等等，儘管這些文件有著不同的格 式，您先確定的是這些文件必然具備的一些操作介面，例如儲存、開啟、關閉等，
 您用一個Document類型來進行操作，這麼一來這個框架就無需考慮實 際的儲存、開啟等細節是如何進行的。
 */
abstract class Document {
	private String title;

	String getTitle() {
		return title;
	}

	void setTitle(String title) {
		this.title = title;
	}

	abstract void open();

	abstract void save();

	abstract void close();
}

abstract class Editor {
	private List<Document> docs = new ArrayList<Document>();

	void open(String file) {
		Document doc = createDocument();
		doc.setTitle(file);
		doc.open();
		docs.add(doc);
	}

	void save(Document doc) {
		doc.save();
	}

	void close(Document doc) {
		doc.close();
		docs.remove(doc);
	}

	void close() {
		for (Document doc : docs) {
			close(doc);
		}
	}

	// ... 其它的方法定義
	abstract Document createDocument(); // Factory method
}

//雖然這邊先以Java實作，但Document為abstract class或interface定義並不重要，重要的是Editor中，
// 流程中所操作的都是Document的公開方法，實際上如何建立具體的 Document，則由子類別來完成，例如：
class TextEditor extends Editor {
	Document createDocument() {
		return new Document() {
			void open() {
				System.out.println("開啟文字檔案 " + this.getTitle());
			}

			void save() {
				System.out.println("儲存文字檔案 " + this.getTitle());
			}

			void close() {
				System.out.println("關閉文字檔案 " + this.getTitle());
			}
		};
	}
}

public class Main {
	public static void main(String[] args) {
		Editor editor = new TextEditor();
		editor.open("Main.java");
		editor.open("Editor.java");
		editor.close();
	}
}