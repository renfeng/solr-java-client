package work.fair24.solr;

import com.google.gson.annotations.SerializedName;

/**
 * Created by renfeng on 4/24/16.
 */
public class SolrPartialUpdate<T> {

	@SerializedName("add")
	private T add;

	@SerializedName("set")
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
}
