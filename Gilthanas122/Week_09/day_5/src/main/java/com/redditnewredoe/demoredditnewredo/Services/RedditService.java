package com.redditnewredoe.demoredditnewredo.Services;

import com.redditnewredoe.demoredditnewredo.Models.Post;
import com.redditnewredoe.demoredditnewredo.Models.User;
import com.redditnewredoe.demoredditnewredo.Repositories.PostRepository;
import com.redditnewredoe.demoredditnewredo.Models.Post;
import com.redditnewredoe.demoredditnewredo.Repositories.PostRepository;
import com.redditnewredoe.demoredditnewredo.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RedditService {
   PostRepository postRepository;
   UserRepository userRepository;
   Post post;

   @Autowired
    public RedditService(PostRepository postRepository, UserRepository userRepository) {
        this.postRepository = postRepository;
        this.userRepository = userRepository;
        this.post = new Post();
    }

    public void saveToPostRepository(Post post){
       postRepository.save(post);
    }

    public void saveToUserRepository(User user){
       userRepository.save(user);
    }

    public Post setLikeCounterDown(Long id) {
        postRepository.findById(id).get().setLikeCounterDown();
        return postRepository.findById(id).get();
    }

    public Post setLikeCounterUp(Long id) {
       postRepository.findById(id).get().setLikeCounterUp();
       return postRepository.findById(id).get();
    }

    public List<Post> topPost() {
       return postRepository.findAllByOrderByLikeCounterDesc();
    }

    public void saveUsertoPost(Post post){
       //post.setUser(userRepository.findLastUserId());
       postRepository.save(post);
    }

    public void setUserLoginToPost(User user){
       this.post.setUser(user);
    }

    public void getUserToPost(Post postIn){
       postIn.setUser(this.post.getUser());
    }
}
