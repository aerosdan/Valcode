import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from 'src/app/auth.service';
import { Usuario } from '../../login/usuario'

@Component({
  selector: 'app-meuperfil',
  templateUrl: './meuperfil.component.html',
  styleUrls: ['./meuperfil.component.css']
})

export class MeuperfilComponent  {

  username: string;
  senha:string;
  cpf:string;
  nome:string;
  sobrenome:string;
  nascimento:string;

  /* usuario: Usuario; */

  loginError: boolean;
  mensagemSucesso:string;

  constructor(
    private router: Router,
    private authService: AuthService
  ) { }


/*   ngOnInit(): void {
    this.router.navigate(['/login'])
  } */


  cadastrarSucess(/* usuario */): void {
    const usuario: Usuario = new Usuario();
    usuario.senha = this.senha;
    usuario.username = this.username;
    usuario.cpf = this.cpf;
    usuario.nome = this.nome;
    usuario.sobrenome = this.sobrenome;
    usuario.nascimento = this.nascimento
    console.log(`email: ${this.username}, nome:${this.nome}`);
    this.authService
        .salvar(usuario)
        .subscribe( response => {
            this.mensagemSucesso = "Cadastro realizado com sucesso. Efetue o login";
            this.loginError = false;
        }, error => {
            this.loginError = true;
            this.mensagemSucesso = null;
        });

    /* this.router.navigate(['/login']) */
  }

  retornaLogin(): void {
    this.router.navigate(['/login']);
  }

}
