import { Component, OnInit } from '@angular/core';
import { Note } from './../../models/Note'

@Component({
  selector: 'app-notes-component',
  templateUrl: './notes-component.component.html',
  styleUrls: ['./notes-component.component.css']
})
export class NotesComponentComponent implements OnInit {

  notes: Note[] = [];

  constructor() { }



  ngOnInit(): void {
    this.notes = [
      {
        content: 'first',
        date: this.getDate()
      },
      {
        content: 'second',
        date: this.getDate()
      },
      {
        content: 'third',
        date: this.getDate()
      }
    ]
  }

  getDate() {
    var today = new Date();
    var date = today.getFullYear()+'-'+(today.getMonth()+1)+'-'+today.getDate();
    var time = today.getHours() + ":" + today.getMinutes() + ":" + today.getSeconds();
    var dateTime = date + ' ' + time;

    return dateTime
  }

  deleteNote (id: number) {
    this.notes = this.notes.filter((v, i) => i !== id);
  }

}
