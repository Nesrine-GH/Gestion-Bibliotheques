import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BibliothequesComponent } from './components/bibliotheques/bibliotheques.component';
import { HomeComponent } from './components/home/home.component';

const routes: Routes = [
  {path:'',component:HomeComponent},
  {path:'Bibliotheques',component:BibliothequesComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
