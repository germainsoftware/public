/* global GermainAPMSiebelHIIE5Utils */

// GermainAPM init
GermainAPM.init({
    beacon_url: 'http://${domain}/ingestion/beacon',
    RT: {enabled: true},
    IframeMonitoring: {enabled: false, eventInit: "page_ready"},
    ClickMonitoring: {enabled: false, frameMonitoringEnabled: false, fullMonitoringEnabled: false},
    MouseMonitoring: {enabled: false, frameMonitoringEnabled: true, snapshotInterval: 1000, pushInterval: 15, eventInit: "page_ready"},
    ChangeMonitoring: {enabled: false, eventInit: "page_ready"},
    KeyboardMonitoring: {enabled: false, eventInit: "page_ready"}
}, {
    USE_AJAX: true,
    CONSOLE_MONITORING: false, // enable console warning and error monitoring
    ALERT_MONITORING: false, // enable window.alert warning and error messages
    REQUEST_BODY_MONITORING: false, // catch request body 
    URL_TITLE: GermainAPMSiebelHIIE5Utils.titleLookup,
    CUMULATIVE_TXN_MONITORING: {
        count: 1,
        refreshInterval: 15, // (in seconds) we check periodically if we can close current cumulative txn and send current cum. txn
        hierarchyId: new Date().getTime() + Math.random().toString(36).substring(6),
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
