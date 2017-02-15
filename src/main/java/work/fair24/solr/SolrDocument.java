package work.fair24.solr;

import com.google.api.client.util.Key;

import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 * extends this class to add doc fields
 * <p>
 * https://cwiki.apache.org/confluence/display/solr/Apache+Solr+Reference+Guide
 * <p>
 * Created by renfeng on 8/15/15.
 */
public class SolrDocument {

	protected static final SimpleDateFormat solrDateFormat =
			new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss'Z'", Locale.forLanguageTag("en_US"));

	/**
	 * http://grepcode.com/file_/repo1.maven.org/maven2/org.apache.solr/solr-solrj/4.10.3/org/apache/solr/client/solrj/util/ClientUtils.java/?v=source
	 * <p/>
	 * for more information on Escaping Special Characters
	 * http://lucene.apache.org/core/4_0_0/queryparser/org/apache/lucene/queryparser/classic/package-summary.html#Escaping_Special_Characters
	 */
	public static String escapeQueryChars(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			// These characters are part of the query syntax and must be escaped
			if (c == '\\' || c == '+' || c == '-' || c == '!' || c == '(' || c == ')' || c == ':'
					|| c == '^' || c == '[' || c == ']' || c == '\"' || c == '{' || c == '}' || c == '~'
					|| c == '*' || c == '?' || c == '|' || c == '&' || c == ';' || c == '/'
					|| Character.isWhitespace(c)) {
				sb.append('\\');
			}
			sb.append(c);
		}
		return sb.toString();
	}

	/**
	 * @param urlBase e.g. http://localhost:8983/solr/solr/
	 */
	protected static String selectUrl(String urlBase) {
		return urlBase + "select?wt=json&indent=true";
	}

	protected static String selectCSVUrl(String urlBase) {
		return urlBase + "select?wt=csv";
	}

	/**
	 * @param urlBase e.g. http://localhost:8983/solr/solr/
	 */
	public static String updateUrl(String urlBase) {
		return urlBase + "update?wt=json&commit=true";
	}

	@Key("id")
	private String id;

	@Key("type_s")
	private String type;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	protected void setType(String type) {
		this.type = type;
	}
}
