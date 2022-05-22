package example

import grails.gorm.services.Service

@Service(MedicalExamination)
interface MedicalExaminationService {

    MedicalExamination get(Serializable id)

    List<MedicalExamination> list(Map args)

    Long count()

    void delete(Serializable id)

    MedicalExamination save(MedicalExamination medicalExamination)

}