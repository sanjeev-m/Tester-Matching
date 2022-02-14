export interface Device {
    id: number;
    description: string;
}

export interface LookUpValues {
    devices: Device[];
    countries: string[];
}

export interface TesterMatchResponse {
    bugsCount: number;
    deviceId: number;
    description: string;
    testerId: number;
    firstName: string;
    lastName: string;
    country: string;
}
