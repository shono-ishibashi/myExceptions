package ecwa.com;

public class PostForm {
    private String postTitel;
    private Integer tag1Id;
    private Integer tag2Id;
    private Integer tag3Id;
    private String content;

    public String getPostTitel() {
        return postTitel;
    }

    public void setPostTitel(String postTitel) {
        this.postTitel = postTitel;
    }

    public Integer getTag1Id() {
        return tag1Id;
    }

    public void setTag1Id(Integer tag1Id) {
        this.tag1Id = tag1Id;
    }

    public Integer getTag2Id() {
        return tag2Id;
    }

    public void setTag2Id(Integer tag2Id) {
        this.tag2Id = tag2Id;
    }

    public Integer getTag3Id() {
        return tag3Id;
    }

    public void setTag3Id(Integer tag3Id) {
        this.tag3Id = tag3Id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
