package wiki;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import fw.DBManager;
import fw.ResultSetBeanMapping;

public class WikiPageDAO {

	private ResultSetBeanMapping<WikiPage> allMapping =
			new ResultSetBeanMapping<WikiPage>() {

		public WikiPage createFromResultSet(ResultSet rs)
			throws SQLException {

			WikiPage page = new WikiPage();
			page.setName(rs.getString("name"));
			page.setContent(rs.getString("content"));
			page.setUpdateTime(rs.getTimestamp("update_time"));
			return page;
		}
	};

	public static WikiPageDAO getInstance(){
		return new WikiPageDAO();
	}

	public List<WikiPage> findAll() throws SQLException {
		String sql = "SELECT * FROM WIKI_PAGE"
				+ " ORDER BY update_time DESC";
		return DBManager.simpleFind(sql, allMapping);
	}

	public WikiPage findByName(String name) throws SQLException{
		String sql = "SELECT * FROM WIKI_PAGE"
				+ " WHERE name='" + name + "'";

		List<WikiPage> list = DBManager.simpleFind(sql,allMapping);
		if(list.size() == 0){
			return null;
		}else if(list.size() > 1){
			throw new IllegalArgumentException("record > 1");
		}

		return list.get(0);

	}

	public void insert(WikiPage page) throws SQLException {
		String sql = "INSERT INTO WIKI_PAGE (name, content)"
				+ " VALUES("
				+ "'" + page.getName() + "'"
				+ ",'" + page.getContent() + "'"
				+ ")";
		DBManager.simpleUpdate(sql);
		System.out.print(sql);
	}

	public void update(WikiPage page) throws SQLException {
		String sql = "UPDATE WIKI_PAGE"
					+ " SET"
					+ " CONTENT='" + page.getContent() + "'"
					+ " WHERE name ='" + page.getName() + "'";
		DBManager.simpleUpdate(sql);
	}

	public void delete(WikiPage page) throws SQLException {
		String sql = "DELETE FROM WIKI_PAGE WHERE name='"
					+ page.getName() + "'";
		DBManager.simpleUpdate(sql);
	}

}
