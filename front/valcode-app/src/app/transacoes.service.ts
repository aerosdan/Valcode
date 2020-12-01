import { LoginComponent } from './login/login.component';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { Transacoes } from './transacoes/transacoes';
import { Observable } from 'rxjs';



@Injectable({
  providedIn: 'root'
})
export class TransacoesService {

  constructor( private http: HttpClient) {}

  salvar ( transacoes:Transacoes ) : Observable<Transacoes>{
    return this.http.post<Transacoes>('http://localhost:8082/api/pagamentos',transacoes);
  }


  getTransacoes(): Observable <Transacoes[]> {
    const tokenString = localStorage.getItem('access_token');
    const token = JSON.parse(tokenString);
    const headers = {
      'Authorization' : 'Bearer ' + token.access_token
    }
    return this.http.get<Transacoes[]>('http://localhost:8082/api/pagamentos', {headers});
  }

  getTransacoesFilter(id: string): Observable <Transacoes[]> {
    const tokenString = localStorage.getItem('access_token');
    const token = JSON.parse(tokenString);
    const headers = {
      'Authorization' : 'Bearer ' + token.access_token
    }
    return this.http.get<Transacoes[]>(`http://localhost:8082/api/pagamentos/${id}`,{headers});
  }


}
