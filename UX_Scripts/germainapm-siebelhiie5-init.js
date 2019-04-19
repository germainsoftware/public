GermainAPM.init({
    beacon_url: 'https://${domain}/ingestion/beacon',
    RT: {enabled: true},
    IframeMonitoring: {enabled: false, eventInit: "page_ready"},
    ClickMonitoring: {enabled: false, frameMonitoringEnabled: false, fullMonitoringEnabled: false},
    MouseMonitoring: {enabled: false, frameMonitoringEnabled: true, snapshotInterval: 1000, pushInterval: 15, eventInit: "page_ready"},
    ChangeMonitoring: {enabled: false, eventInit: "page_ready"},
    KeyboardMonitoring: {enabled: false, eventInit: "page_ready"},
    PopupDialogMonitoring: {enabled: false},
    ConsoleMonitoring: {enabled: false}
}, {
    REQUEST_BODY_MONITORING: false, // catch request body 
    PAGE_TITLE: GermainAPMSiebelHIIE5Utils.titleLookup,
    SEND_SYNC_ON_UNLOAD: true, // this only applies when the navigator.sendBeacon is unavailable (IE)
    USER_CLICK: {
        count: 0,
        refreshInterval: 15, // (in seconds) we check periodically if we can close current user click txn and send current cum. txn
        sequence: new Date().getTime() + Math.random().toString(36).substring(6),
        excludeUrls: []
    },
    DATA_TIMEOUT : 10000, // how long we can try to send collect data back (in ms)
    EXCLUDE_URLS: []
}, {
    appName: 'Siebel',
    // serverHost: null, // provide if you want to hardcode serverHost value
    username: GermainAPMSiebelHIIE5Utils.usernameLookup,
    session: GermainAPMSiebelHIIE5Utils.sessionLookup
});
