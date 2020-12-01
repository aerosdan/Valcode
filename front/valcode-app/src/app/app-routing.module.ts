import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { HomeComponent} from './home/home.component';
import { PontosComponent} from './views/pontos/pontos.component';
import { GerenciadorComponent} from './views/gerenciador/gerenciador.component';

import { HelperComponent} from './views/helper/helper.component';
import { MeuperfilComponent} from './views/meuperfil/meuperfil.component';
import { LoginComponent} from './login/login.component';
import { ForgotpasswordComponent} from './views/forgotpassword/forgotpassword.component';
import { RegisterComponent } from './views/register/register.component';
import { TransacoesListaComponent } from './transacoes/transacoes-lista/transacoes-lista.component';
import { LayoutComponent } from './layout/layout.component';


const routes: Routes = [

{ path:"meuperfil", component: MeuperfilComponent },
{ path:"login", component: LoginComponent },
{ path:"forgotpassword", component: ForgotpasswordComponent },

{ path:'teste', component: LayoutComponent, children: [

{ path:'home', component: HomeComponent },
{ path:"pontos", component: PontosComponent },
{ path:"gerenciador", component: GerenciadorComponent },
{ path:"helper", component: HelperComponent },
{ path: "register", component: RegisterComponent },
{ path:"transacoes-lista", component: TransacoesListaComponent }

]}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }