import React, { Component } from 'react';
import Post from './Post';

class Posts extends Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
      hasError: false
    };
  }

  componentDidMount() {
    this.loadPosts();
  }

 loadPosts() {
  const data = [
    {
      userId: 1,
      id: 1,
      title: 'How to Build a React App',
      body: 'This post explains the basic steps to build a React application using Create React App.'
    },
    {
      userId: 2,
      id: 2,
      title: 'Understanding Component Lifecycle',
      body: 'In this post, we explore how lifecycle methods work in React class components.'
    },
    {
      userId: 3,
      id: 3,
      title: 'Why Use React?',
      body: 'React is a powerful JavaScript library for building user interfaces efficiently.'
    }
  ];

  const postList = data.map(post => new Post(post.userId, post.id, post.title, post.body));
  this.setState({ posts: postList });
}


  componentDidCatch(error, info) {
    alert('Something went wrong while rendering posts.');
    console.error('Error caught by componentDidCatch:', error, info);
  }

  render() {
    if (this.state.hasError) {
      return <h2>Error loading posts</h2>;
    }

    return (
      <div>
        <h1>Blog Posts</h1>
        {this.state.posts.map(post => (
          <div key={post.id} style={{ marginBottom: '20px' }}>
            <h3>{post.title}</h3>
            <p>{post.body}</p>
          </div>
        ))}
      </div>
    );
  }
}

export default Posts;
