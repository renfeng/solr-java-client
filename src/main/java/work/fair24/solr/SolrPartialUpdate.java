package work.fair24.solr;

import com.google.api.client.util.Key;

/**
 * Created by renfeng on 4/24/16.
 */
public class SolrPartialUpdate<T> {

	@Key("add")
	private T add;

	@Key("set")
	private T set;

	public T getAdd() {
		return add;
	}

	public void setAdd(T add) {
		this.add = add;
	}

	public T getSet() {
		return set;
	}

	public void setSet(T set) {
		this.set = set;
	}

	public SolrPartialUpdate set(T set) {
		this.set = set;
		return this;
	}

	public T set() {
		return set;
	}

	public SolrPartialUpdate add(T add) {
		this.add = add;
		return this;
	}

	public T add() {
		return add;
	}
}
