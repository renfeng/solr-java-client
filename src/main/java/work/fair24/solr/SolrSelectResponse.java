package work.fair24.solr;

import com.google.api.client.util.Key;

import java.util.Map;

/**
 * Created by renfeng on 8/15/15.
 */
public class SolrSelectResponse<T extends SolrDocument, F extends SolrFacetFields> {

//	@Key
//	private SolrResponseHeader responseHeader;

	@Key("response")
	private SolrResponse<T> response;

	@Key("facet_counts")
	private SolrFacetCounts<F> facetCounts;

	@Key("highlighting")
	private Map<String, String> highlighting;

	public SolrResponse<T> getResponse() {
		return response;
	}

	public void setResponse(SolrResponse<T> response) {
		this.response = response;
	}

	public SolrFacetCounts<F> getFacetCounts() {
		return facetCounts;
	}

	public void setFacetCounts(SolrFacetCounts<F> facetCounts) {
		this.facetCounts = facetCounts;
	}

	public Map<String, String> getHighlighting() {
		return highlighting;
	}

	public void setHighlighting(Map<String, String> highlighting) {
		this.highlighting = highlighting;
	}
}
