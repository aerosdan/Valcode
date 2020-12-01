import { Component, OnInit } from '@angular/core';

import { Transacoes } from '../transacoes';
import { TransacoesService } from '../../transacoes.service';


@Component({
  selector: 'app-transacoes-form',
  templateUrl: './transacoes-form.component.html',
  styleUrls: ['./transacoes-form.component.css']
})
export class TransacoesFormComponent implements OnInit {

  transacoes: Transacoes;
  

  constructor( private service:TransacoesService ) { 
    this.transacoes = new Transacoes();  
  }

  ngOnInit(): void {
  }

  onSubmit(){
    this.service
      .salvar(this.transacoes)
      .subscribe( response => {
          console.log(response);
          this.transacoes = response;
        } )
  }
}
