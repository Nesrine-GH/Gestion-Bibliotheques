import { Component, OnInit } from '@angular/core';
import { BibliothequesService } from 'src/app/Services/bibliotheques.service';

@Component({
  selector: 'app-bibliotheques',
  templateUrl: './bibliotheques.component.html',
  styleUrls: ['./bibliotheques.component.css']
})
export class BibliothequesComponent implements OnInit {

  constructor(
    private bibliothequeService: BibliothequesService,
  ) { }
  lalisteBibliotheques: any;
  toto: any;
  ngOnInit(): void {

    this.listeBibliotheques()
  }
  listeBibliotheques() {
    this.bibliothequeService.getBibliotheque().subscribe(data => {
      this.lalisteBibliotheques = data

      console.log(this.lalisteBibliotheques)
    })
  }

  getNbrAdherantBetween(toto: any) {

    console.log(toto);
    var paramA = toto.min;
    var paramB = toto.max;
    this.bibliothequeService.getNbrAdherant(paramA, paramB).subscribe(data => {

      this.lalisteBibliotheques = data;
      console.log(this.toto);
    })


  }


}


