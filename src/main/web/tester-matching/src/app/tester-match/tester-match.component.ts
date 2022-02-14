import {Component, OnInit} from '@angular/core';
import {TesterMatchService} from "./tester-match.service";
import {Device, TesterMatchResponse} from "./tester-match.model";
import {MatTableDataSource} from "@angular/material/table";


@Component({
  selector: 'app-tester-match',
  templateUrl: './tester-match.component.html',
  styleUrls: ['./tester-match.component.css']
})
export class TesterMatchComponent implements OnInit {

  constructor(private testerMatchService: TesterMatchService) {
  }

  public countries: string[] = []
  public devices: Device[] = []
  public countriesSelected: string[] = []
  public devicesSelected: Device[] = []
  public testerMatchResponseList: TesterMatchResponse[] = []
  displayedColumns: string[] = ['User Name', 'Country', 'Device', 'No. Of Bugs'];
  displayedColumnsMat: string[] = ['name', 'description', 'country', 'bugsCount'];
  dataSource: MatTableDataSource<TesterMatchResponse> | undefined;

  ngOnInit(): void {
    this.getLookUpValues();
    this.devices = [];
    this.countriesSelected = [];
    this.testerMatchResponseList = [];
  }

  private getLookUpValues() {
    this.testerMatchService.getLookUpValues()
      .subscribe(lookUpVal => {
        console.log(lookUpVal);
        this.countries = lookUpVal.countries;
        this.devices = lookUpVal.devices;
      });
  }

  getTesterMatch() {
    const request = {
      "countries": this.countriesSelected,
      "devices": this.devicesSelected
    }
    this.testerMatchService.getTesterMatchingData(request)
      .subscribe(data => {
        console.log(data);
        this.testerMatchResponseList = data;
        this.dataSource = new MatTableDataSource(data);
      });

  }

  resetTesterMatch() {
    this.countriesSelected = [];
    this.devicesSelected = [];
    this.testerMatchResponseList = [];
    this.dataSource = new MatTableDataSource(this.testerMatchResponseList);
  }

  selectAllDevices(event: any) {
    if (event.checked) {
      this.devicesSelected = this.devices;
    } else {
      this.devicesSelected = [];
    }
  }

  selectAllCountries(event: any) {
    if (event.checked) {
      this.countriesSelected = this.countries;
    } else {
      this.countriesSelected = [];
    }
  }

  getFullName(element: TesterMatchResponse) {
    return element ? element.firstName + ' ' + element.lastName : null;
  }
}
