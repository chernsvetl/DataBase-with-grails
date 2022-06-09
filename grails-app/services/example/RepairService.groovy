package example

import grails.gorm.services.Service


import grails.gorm.services.Service
import java.text.SimpleDateFormat

@Service(Repair)
abstract class RepairService {

    abstract Repair get(Serializable id)

    abstract List<Repair> list(Map args)

    List<Repair> listWithParams(Map args) {
        Date fromDate = parseDate(args.get("fromDate"))
        Date toDate = parseDate(args.get("toDate"))

        Date fromDateEnd = parseDate(args.get("fromDateEnd"))
        Date toDateEnd = parseDate(args.get("toDateEnd"))

        Integer planeId = args.get("plane") as Integer
        if (planeId < 0) {
            planeId = null
        }

        return Repair.list(args).findAll {
            (planeId != null && it.plane.id == planeId || planeId == null)
        }.findAll {
            (fromDate != null && it.startTime.after(fromDate) || fromDate == null)
        }.findAll {
            (toDate != null && it.startTime.before(toDate) || toDate == null)
        }.findAll {
            (fromDateEnd != null && it.endTime.after(fromDateEnd) || fromDateEnd == null)
        }.findAll {
            (toDateEnd != null && it.endTime.before(toDateEnd) || toDateEnd == null)
        }
    }

    abstract Long count()

    abstract void delete(Serializable id)

    abstract Repair save(Repair repair)


    private static Date parseDate(Object stringObject) {
        if (stringObject == null || stringObject.toString().empty) {
            return null
        }
        try {
            String pattern = "yyyy-MM-dd"
            return new SimpleDateFormat(pattern).parse(stringObject.toString())
        } catch(Exception ignored) {
            return null
        }
    }
}