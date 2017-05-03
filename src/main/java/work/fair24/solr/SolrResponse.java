package work.fair24.solr;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by renfeng on 8/15/15.
 */
public class SolrResponse<T extends SolrDocument> {

	@SerializedName("numFound")
	private int numFound;

	@SerializedName("start")
	private int start;

	@SerializedName("docs")
	private List<T> docs;

	public List<T> getDocs() {
		return docs;
	}

	public void setDocs(List<T> docs) {
		this.docs = docs;
	}

	public int getNumFound() {
		return numFound;
	}

	public void setNumFound(int numFound) {
		this.numFound = numFound;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}
}
