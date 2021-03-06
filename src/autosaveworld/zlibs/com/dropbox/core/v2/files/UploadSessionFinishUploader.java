/* DO NOT EDIT */
/* This file was generated by Stone */

package autosaveworld.zlibs.com.dropbox.core.v2.files;

import autosaveworld.zlibs.com.dropbox.core.DbxUploader;
import autosaveworld.zlibs.com.dropbox.core.DbxWrappedException;
import autosaveworld.zlibs.com.dropbox.core.http.HttpRequestor;

/**
 * The {@link DbxUploader} returned by {@link
 * DbxUserFilesRequests#uploadSessionFinish(UploadSessionCursor,CommitInfo)}.
 *
 * <p> Use this class to upload data to the server and complete the request.
 * </p>
 *
 * <p> This class should be properly closed after use to prevent resource leaks
 * and allow network connection reuse. Always call {@link #close} when complete
 * (see {@link DbxUploader} for examples). </p>
 */
public class UploadSessionFinishUploader extends DbxUploader<FileMetadata, UploadSessionFinishError, UploadSessionFinishErrorException> {

    /**
     * Creates a new instance of this uploader.
     *
     * @param httpUploader  Initiated HTTP upload request
     *
     * @throws NullPointerException  if {@code httpUploader} is {@code null}
     */
    public UploadSessionFinishUploader(HttpRequestor.Uploader httpUploader) {
        super(httpUploader, FileMetadata.Serializer.INSTANCE, UploadSessionFinishError.Serializer.INSTANCE);
    }

    protected UploadSessionFinishErrorException newException(DbxWrappedException error) {
        return new UploadSessionFinishErrorException("2/files/upload_session/finish", error.getRequestId(), error.getUserMessage(), (UploadSessionFinishError) error.getErrorValue());
    }
}
