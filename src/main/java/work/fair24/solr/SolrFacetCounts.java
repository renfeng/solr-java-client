package work.fair24.solr;

import com.google.api.client.util.Key;

/**
 * Created by renfeng on 8/15/15.
 */
public class SolrFacetCounts<F extends SolrFacetFields> {

//	@Key("facet_queries")
//	private SolrFacetQueries facetQueries;

	@Key("facet_fields")
	private F facetFields;

//	@Key("facet_dates")
//	private SolrFacetDates facetDates;

//	@Key("facet_ranges")
//	private SolrFacetRanges facetRanges;

	public F getFacetFields() {
		return facetFields;
	}

	public void setFacetFields(F facetFields) {
		this.facetFields = facetFields;
	}
}
