class Version {
    String releaseTag
 
    String toString() {
		((releaseTag != null && releaseTag.length() > 0) ? "${releaseTag}":"")
    }
}
