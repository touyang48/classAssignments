let list = $('ul.outPutList');

$(document).ready(function(){

    $("#getAllPost").on('click', function(){
        list.text("")
      $.get("http://jsonplaceholder.typicode.com/posts", function(posts){
        console.log(posts);
        posts.forEach(function(post){
            const li = $('<li>');
            li.text('Post ' + post.id + ': ' + post.body);
            list.append(li);
      });
    });
  });


$("#getPostId10").on('click', function(){
    list.text("")
  $.get("http://jsonplaceholder.typicode.com/posts", function(posts){
    posts.forEach(function(post){
        if (post.id == 10){
        const li = $('<li>');
        li.text('Post ' + post.id + ': ' + post.body);
        list.append(li);
    }});
});
});

$("#getComments12").on('click', function(){
    list.text("")
  $.get("http://jsonplaceholder.typicode.com/comments", function(comments){
    comments.forEach(function(comment){
        if (comment.postId === 12){
        const li = $('<li>');
        li.text('Post 12 comments :'+ comment.body);
        list.append(li);

            }});
        });
    });

    $("#getUserId2").on('click', function(){
        list.text("")
      $.get("http://jsonplaceholder.typicode.com/posts", function(posts){
        posts.forEach(function(post){
            if (post.userId === 2){
            const li = $('<li>');
            li.text('Post from User 2 :'+ post.body);
            list.append(li);
    
                }});
            });
        });
});




