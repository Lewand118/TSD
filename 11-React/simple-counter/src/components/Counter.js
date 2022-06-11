import React, { Component } from 'react';
import Button from './Button';

export default class Counter extends Component {
    constructor(props){
        super(props)
        this.state = {
            count: 0
          };
    }
    
    render(){
        return (
            <div className="app">
                <div>
                <div class="count">
                    <h1 style={{color: this.state.count!==0 ? this.state.count<0 ? "red" : "green" : "black"}}>{this.state.count}</h1>
                </div>
                <div class="buttons">
                    <button onClick={() => this.setState({ count: this.state.count - 1 })}>-</button>
                    <button onClick={() => this.setState({ count: this.state.count + 1 })}>+</button>
                </div>
                </div>
            </div>
        );
    }
    
}