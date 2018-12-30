package work.fair24.solr;

import com.google.api.client.util.Key;

import java.util.List;

/**
 * Delete by a list of document IDs.
 * See https://lucene.apache.org/solr/guide/6_6/uploading-data-with-index-handlers.html#UploadingDatawithIndexHandlers-SendingJSONUpdateCommands
 * Created by renfeng on 8/15/15.
 */
public class SolrDeleteRequest<T> {

	@Key("delete")
	private List<T> delete;

	public List<T> getDelete() {
		return delete;
	}

	public void setDelete(List<T> delete) {
		this.delete = delete;
	}
}
