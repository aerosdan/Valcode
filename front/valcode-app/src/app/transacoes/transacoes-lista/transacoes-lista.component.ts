import { Component, OnInit } from '@angular/core';
import { TransacoesService } from '../../transacoes.service';
import { Transacoes } from '../transacoes';

@Component({
  selector: 'app-transacoes-lista',
  templateUrl: './transacoes-lista.component.html',
  styleUrls: ['./transacoes-lista.component.css']
})
export class TransacoesListaComponent implements OnInit {

  public transacoes: Transacoes[] = [];
  
  public pagamentos_doc_cli: string;

  constructor(private service: TransacoesService) { }

  ngOnInit(): void {
    let username: string = sessionStorage.getItem("user");
    
    this.service
    .getTransacoesFilter(username)
      .subscribe( resposta => {        
        this.transacoes = resposta 
        console.log(this.transacoes)     
      });/*console.log(resposta)*/      
 }

  filtrar(){
    /*console.log(this.pagamentos_doc_cli)*/
    let username: string = sessionStorage.getItem("user");
    this.service
      .getTransacoesFilter(username)
      .subscribe( resposta => {        
        this.transacoes = resposta 
        console.log(this.transacoes)     
      });
  }

}

