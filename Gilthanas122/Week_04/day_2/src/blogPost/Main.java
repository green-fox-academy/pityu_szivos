package blogPost;

public class Main {

    public static void main(String[] args) {

        BlogPost blogPost = new BlogPost("John Doe", "My Entry", "2018.11.01", "Nothing that long");
        BlogPost blogPost2 = new BlogPost("Jane Doe", "My Entry", "2018.11.01", "Nothing that long");

        Blog blog = new Blog();

        blog.addEntry(blogPost);
        blog.addEntry(blogPost);
        blog.addEntry(blogPost);
        blog.addEntry(blogPost2);
        blog.addEntry(blogPost2);
        blog.addEntry(blogPost2);
        System.out.println(blog.toString());
        blog.removeItem(0);
        System.out.println(blog.toString());

        blog.changeItem(1, blogPost2);
    }


}

