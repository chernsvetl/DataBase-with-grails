

def filters = {
    allExceptIndex(controller:"site",action:"index",invert:true) {
        before = {
        }
        after = { Map model ->
        }
        afterView = { Exception e ->
        }
    }
}