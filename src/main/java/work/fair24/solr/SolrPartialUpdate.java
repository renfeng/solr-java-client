package work.fair24.solr;

import com.google.api.client.util.Key;

/**
 * See https://lucene.apache.org/solr/guide/6_6/updating-parts-of-documents.html
 * Created by renfeng on 4/24/16.
 */
public class SolrPartialUpdate<T> {

	@Key("add")
	private T add;

	@Key("inc")
	private T inc;

	@Key("remove")
	private T remove;

	@Key("removeregex")
	private T removeregex;

	@Key("set")
	private T set;

	public T getAdd() {
		return add;
	}

	public void setAdd(T add) {
		this.add = add;
	}

	public T getInc() {
		return inc;
	}

	public void setInc(T inc) {
		this.inc = inc;
	}

	public T getRemove() {
		return remove;
	}

	public void setRemove(T remove) {
		this.remove = remove;
	}

	public T getRemoveregex() {
		return removeregex;
	}

	public void setRemoveregex(T removeregex) {
		this.removeregex = removeregex;
	}

	public T getSet() {
		return set;
	}

	public void setSet(T set) {
		this.set = set;
	}

	public SolrPartialUpdate<T> set(T set) {
		this.set = set;
		return this;
	}

	public T set() {
		return set;
	}

	public SolrPartialUpdate<T> add(T add) {
		this.add = add;
		return this;
	}

	public T add() {
		return add;
	}
}
