package work.fair24.solr;

import com.google.api.client.util.Key;

/**
 * Created by renfeng on 4/24/16.
 */
public class SolrPartiallySet<T> {

	@Key("set")
	private T value;

	public SolrPartiallySet(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
}
