package com.redditproject.demoreddigproject.Services;

import com.redditproject.demoreddigproject.Models.Post;
import com.redditproject.demoreddigproject.Repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RedditService {
   PostRepository postRepository;

   @Autowired
    public RedditService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public void saveToPostRepository(Post post){
       postRepository.save(post);
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
}
