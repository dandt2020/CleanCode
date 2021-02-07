# Đỗ Trọng Dân
## Khoá học Clean Code - Luvina 2020


## Phần 1: Clean Code căn bản
1. 5 mục tiêu chính của Clean Code là
   - Mục tiêu 1: Source Code phải thanh lịch: Hãy hình dung đến 2 chữ "thanh lịch", nó phải sạch sẽ, cảm thấy hứng thú khi đọc. Giống như khi bạn chăm chú đọc một bài văn hay vậy.
   - Mục tiêu 2: Code phải có tâm điểm (focus) : Mỗi fucntion, mỗi class, mỗi module chỉ thực hiện một chức năng duy nhất, không bị phân tán, bởi các context xung quanh.
   - Mục tiêu 3: Clean code thì được trau chuốt, người code ra nó đã dành thời gian để giữ cho nó đơn giản và có trật tự nhất có thể.
   - Mục tiêu 4: Chạy tốt trên tất cả các case : Đôi khi các function được tạo ra chỉ chạy tốt trên các case bình thường, còn các case "quái dị" thì xảy ra lỗi.
   - Mục tiêu 5: Tối ưu số lượng các class, method, function ...
2. Đáp án của tôi là team C bởi vì:
   - Lý do 1: Vì không phải quy tắc nào cũng có thể áp dụng được luôn vào dự án khi mới bắt đầu
3. Không. Vì nếu để mỗi người code theo 1 style riêng thì việc sửa chữa, và bảo trì còn làm tốn thời gian hơn.
4. Đề xuất của Bob là phù hợp.
5. 

```Java
public class User {
   private long id;
   private String fullName;
   private ArrayList<Post> posts;  //Một người có thể viết nhiều Post
   private ArrayList<Comment> comments; //Một người có thể bình luận nhiều Comment
   
   void writeComment(Comment comment) {
     comments.add(comment);
   }
   
   void deleteComment(Comment comment) throws CommentException {
     comments.remove(comment);
   }

   void writePost(Post post) { //ví dụ mẫu một phương thức nhé
      posts.add(post);
   }

   void deletePost(Post post) throws PostException {  //Nếu tác động lên dữ liệu nếu có lỗi thì hãy throw ra Exception
      posts.remove(post);
   }
}

public class Post {
   private long id;
   private String title;
   private String content;
   private User author; //Tác giả của bài viết
   private ArrayList<Comment> comments; //Một post chứa nhiều Comment
   
   void writeCommentComment(Comment comment) {
     comments.add(comment);
   }
   
   void deleteComment(Comment comment) {
     comment.remove(comment);
   }
}

private class Comment{
   private long id;
   private String title;
   private Post post; //Bài viết mà comment gắn vào
   private User author; //Tác giả của comment
}
```

## Phần 2: OOP và SOLID
### 1. Hãy lập trình Java để thực hiện thiết kế như hình vẽ
    - [GraphicEditor](https://github.com/dandt2020/CleanCode/tree/master/graphiceditor/after)

## Phần 3: Thiết kế CSDL Quan hệ theo đặc tả
    - [Courses Database](https://github.com/dandt2020/CleanCode/tree/master/courses)
## Phần 4: Thiết kế RESTful API
    - [User RESTful](https://github.com/dandt2020/CleanCode/tree/master/RESTfulAPI)
	-> Do chưa biết về spring boot nên phần bài tập này em làm có thể không đúng 
## Phần 5: Lập trình Restful API
    - [User RESTful](https://github.com/dandt2020/CleanCode/tree/master/RESTfulAPI)
	-> Do chưa biết về spring boot nên phần bài tập này em làm có thể không đúng 
## Trắc nghiệm
1. C
2. B
3. D
4. C
5. A
6. B
7. B
8. A
9. B
10. A
11. C
12. C
13. B
14. D
15. D
16. A
17. D
18. A
19. C
20. B
21. B
22. C
23. A
24. C
25. A
