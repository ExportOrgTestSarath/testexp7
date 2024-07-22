import { TableOneConfgBase} from '@baseapp/table-one-confg/table-one-confg/table-one-confg.base.model';

export class TableOneConfgApiConstants {
    public static readonly getDatatableData: any = {
        url: '/rest/tableoneconfgs/datatable',
        method: 'POST',
        showloading: true
    };
    public static readonly delete: any = {
        url: '/rest/tableoneconfgs/{ids}',
        method: 'DELETE',
        showloading: true
    };
    public static readonly getById: any = {
        url: '/rest/tableoneconfgs/{sid}',
        method: 'GET',
        showloading: true
    };
    public static readonly update: any = {
        url: '/rest/tableoneconfgs/',
        method: 'PUT',
        showloading: true
    };
    public static readonly autoSuggestService: any = {
        url: '/rest/tableoneconfgs/autosuggest',
        method: 'GET',
        showloading: true
    };
    public static readonly getByValue1: any = {
        url: '/rest/tableoneconfgs/byvalue1/{value1}',
        method: 'GET',
        showloading: true
    };
    public static readonly create: any = {
        url: '/rest/tableoneconfgs/',
        method: 'POST',
        showloading: true
    };
}