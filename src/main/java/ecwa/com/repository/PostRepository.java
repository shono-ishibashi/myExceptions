package ecwa.com.repository;

import ecwa.com.entity.Post;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

@Repository
public class PostRepository {

    private NamedParameterJdbcTemplate template;

    public static final RowMapper<Post> POST_ROW_MAPPER = (rs,i)->{
        Post post = new Post();
        post.setId(rs.getString("id"));
        post.setPostUser(rs.getString("post_user"));
        post.setPostContent(rs.getString("post_content"));
        post.setTitle(rs.getString("title"));
        post.setTag(rs.getString("tag"));
        return post;
    };

    public Post load(String id) {
        String sql = "SELECT * FORM posts as p JOIN tags ON p.";
        SqlParameterSource param = new MapSqlParameterSource().addValue("id", id);
        Post post = template.queryForObject(sql,param , POST_ROW_MAPPER);
        return post;
    }

}
