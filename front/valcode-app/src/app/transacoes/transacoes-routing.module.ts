import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { TransacoesFormComponent } from './transacoes-form/transacoes-form.component';
import { TransacoesListaComponent } from './transacoes-lista/transacoes-lista.component';

const routes: Routes = [
  


];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class TransacoesRoutingModule { 

  
}
