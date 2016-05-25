package ctrip.gradation

import grails.transaction.Transactional

@Transactional
class TicketService {

    def save() {

        def t = new Ticket(id:1, buildId: 1000, platform: 'IOS')

        t.save()
    }
}
