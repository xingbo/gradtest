package ctrip.gradation

class Ticket {

    static constraints = {
    }

    int tid
    int buildId
    int buildRefId
    String commitId
    String buildUrl
    Date triggerTime
    String platform
    String appSourceTar
    String appVersion
    String appDescription
    String appDlUrl
    String plistDlUrl
    Date onlineTime
    Date offlineTime
    short status

}
