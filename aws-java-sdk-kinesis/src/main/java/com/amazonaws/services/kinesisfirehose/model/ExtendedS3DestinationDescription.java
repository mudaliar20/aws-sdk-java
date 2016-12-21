/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.kinesisfirehose.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a destination in Amazon S3.
 * </p>
 */
public class ExtendedS3DestinationDescription implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the AWS credentials.
     * </p>
     */
    private String roleARN;
    /**
     * <p>
     * The ARN of the S3 bucket.
     * </p>
     */
    private String bucketARN;
    /**
     * <p>
     * The "YYYY/MM/DD/HH" time format prefix is automatically used for delivered S3 files. You can specify an extra
     * prefix to be added in front of the time format prefix. Note that if the prefix ends with a slash, it appears as a
     * folder in the S3 bucket. For more information, see <a
     * href="http://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html">Amazon S3 Object Name Format</a> in the
     * <i>Amazon Kinesis Firehose Developer Guide</i>.
     * </p>
     */
    private String prefix;
    /**
     * <p>
     * The buffering option.
     * </p>
     */
    private BufferingHints bufferingHints;
    /**
     * <p>
     * The compression format. If no value is specified, the default is <code>UNCOMPRESSED</code>.
     * </p>
     */
    private String compressionFormat;
    /**
     * <p>
     * The encryption configuration. If no value is specified, the default is no encryption.
     * </p>
     */
    private EncryptionConfiguration encryptionConfiguration;
    /**
     * <p>
     * The CloudWatch logging options for your delivery stream.
     * </p>
     */
    private CloudWatchLoggingOptions cloudWatchLoggingOptions;
    /**
     * <p>
     * The data processing configuration.
     * </p>
     */
    private ProcessingConfiguration processingConfiguration;
    /**
     * <p>
     * The Amazon S3 backup mode.
     * </p>
     */
    private String s3BackupMode;
    /**
     * <p>
     * The configuration for backup in Amazon S3.
     * </p>
     */
    private S3DestinationDescription s3BackupDescription;

    /**
     * <p>
     * The ARN of the AWS credentials.
     * </p>
     * 
     * @param roleARN
     *        The ARN of the AWS credentials.
     */

    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }

    /**
     * <p>
     * The ARN of the AWS credentials.
     * </p>
     * 
     * @return The ARN of the AWS credentials.
     */

    public String getRoleARN() {
        return this.roleARN;
    }

    /**
     * <p>
     * The ARN of the AWS credentials.
     * </p>
     * 
     * @param roleARN
     *        The ARN of the AWS credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExtendedS3DestinationDescription withRoleARN(String roleARN) {
        setRoleARN(roleARN);
        return this;
    }

    /**
     * <p>
     * The ARN of the S3 bucket.
     * </p>
     * 
     * @param bucketARN
     *        The ARN of the S3 bucket.
     */

    public void setBucketARN(String bucketARN) {
        this.bucketARN = bucketARN;
    }

    /**
     * <p>
     * The ARN of the S3 bucket.
     * </p>
     * 
     * @return The ARN of the S3 bucket.
     */

    public String getBucketARN() {
        return this.bucketARN;
    }

    /**
     * <p>
     * The ARN of the S3 bucket.
     * </p>
     * 
     * @param bucketARN
     *        The ARN of the S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExtendedS3DestinationDescription withBucketARN(String bucketARN) {
        setBucketARN(bucketARN);
        return this;
    }

    /**
     * <p>
     * The "YYYY/MM/DD/HH" time format prefix is automatically used for delivered S3 files. You can specify an extra
     * prefix to be added in front of the time format prefix. Note that if the prefix ends with a slash, it appears as a
     * folder in the S3 bucket. For more information, see <a
     * href="http://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html">Amazon S3 Object Name Format</a> in the
     * <i>Amazon Kinesis Firehose Developer Guide</i>.
     * </p>
     * 
     * @param prefix
     *        The "YYYY/MM/DD/HH" time format prefix is automatically used for delivered S3 files. You can specify an
     *        extra prefix to be added in front of the time format prefix. Note that if the prefix ends with a slash, it
     *        appears as a folder in the S3 bucket. For more information, see <a
     *        href="http://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html">Amazon S3 Object Name Format</a>
     *        in the <i>Amazon Kinesis Firehose Developer Guide</i>.
     */

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * The "YYYY/MM/DD/HH" time format prefix is automatically used for delivered S3 files. You can specify an extra
     * prefix to be added in front of the time format prefix. Note that if the prefix ends with a slash, it appears as a
     * folder in the S3 bucket. For more information, see <a
     * href="http://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html">Amazon S3 Object Name Format</a> in the
     * <i>Amazon Kinesis Firehose Developer Guide</i>.
     * </p>
     * 
     * @return The "YYYY/MM/DD/HH" time format prefix is automatically used for delivered S3 files. You can specify an
     *         extra prefix to be added in front of the time format prefix. Note that if the prefix ends with a slash,
     *         it appears as a folder in the S3 bucket. For more information, see <a
     *         href="http://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html">Amazon S3 Object Name Format</a>
     *         in the <i>Amazon Kinesis Firehose Developer Guide</i>.
     */

    public String getPrefix() {
        return this.prefix;
    }

    /**
     * <p>
     * The "YYYY/MM/DD/HH" time format prefix is automatically used for delivered S3 files. You can specify an extra
     * prefix to be added in front of the time format prefix. Note that if the prefix ends with a slash, it appears as a
     * folder in the S3 bucket. For more information, see <a
     * href="http://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html">Amazon S3 Object Name Format</a> in the
     * <i>Amazon Kinesis Firehose Developer Guide</i>.
     * </p>
     * 
     * @param prefix
     *        The "YYYY/MM/DD/HH" time format prefix is automatically used for delivered S3 files. You can specify an
     *        extra prefix to be added in front of the time format prefix. Note that if the prefix ends with a slash, it
     *        appears as a folder in the S3 bucket. For more information, see <a
     *        href="http://docs.aws.amazon.com/firehose/latest/dev/basic-deliver.html">Amazon S3 Object Name Format</a>
     *        in the <i>Amazon Kinesis Firehose Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExtendedS3DestinationDescription withPrefix(String prefix) {
        setPrefix(prefix);
        return this;
    }

    /**
     * <p>
     * The buffering option.
     * </p>
     * 
     * @param bufferingHints
     *        The buffering option.
     */

    public void setBufferingHints(BufferingHints bufferingHints) {
        this.bufferingHints = bufferingHints;
    }

    /**
     * <p>
     * The buffering option.
     * </p>
     * 
     * @return The buffering option.
     */

    public BufferingHints getBufferingHints() {
        return this.bufferingHints;
    }

    /**
     * <p>
     * The buffering option.
     * </p>
     * 
     * @param bufferingHints
     *        The buffering option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExtendedS3DestinationDescription withBufferingHints(BufferingHints bufferingHints) {
        setBufferingHints(bufferingHints);
        return this;
    }

    /**
     * <p>
     * The compression format. If no value is specified, the default is <code>UNCOMPRESSED</code>.
     * </p>
     * 
     * @param compressionFormat
     *        The compression format. If no value is specified, the default is <code>UNCOMPRESSED</code>.
     * @see CompressionFormat
     */

    public void setCompressionFormat(String compressionFormat) {
        this.compressionFormat = compressionFormat;
    }

    /**
     * <p>
     * The compression format. If no value is specified, the default is <code>UNCOMPRESSED</code>.
     * </p>
     * 
     * @return The compression format. If no value is specified, the default is <code>UNCOMPRESSED</code>.
     * @see CompressionFormat
     */

    public String getCompressionFormat() {
        return this.compressionFormat;
    }

    /**
     * <p>
     * The compression format. If no value is specified, the default is <code>UNCOMPRESSED</code>.
     * </p>
     * 
     * @param compressionFormat
     *        The compression format. If no value is specified, the default is <code>UNCOMPRESSED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CompressionFormat
     */

    public ExtendedS3DestinationDescription withCompressionFormat(String compressionFormat) {
        setCompressionFormat(compressionFormat);
        return this;
    }

    /**
     * <p>
     * The compression format. If no value is specified, the default is <code>UNCOMPRESSED</code>.
     * </p>
     * 
     * @param compressionFormat
     *        The compression format. If no value is specified, the default is <code>UNCOMPRESSED</code>.
     * @see CompressionFormat
     */

    public void setCompressionFormat(CompressionFormat compressionFormat) {
        this.compressionFormat = compressionFormat.toString();
    }

    /**
     * <p>
     * The compression format. If no value is specified, the default is <code>UNCOMPRESSED</code>.
     * </p>
     * 
     * @param compressionFormat
     *        The compression format. If no value is specified, the default is <code>UNCOMPRESSED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CompressionFormat
     */

    public ExtendedS3DestinationDescription withCompressionFormat(CompressionFormat compressionFormat) {
        setCompressionFormat(compressionFormat);
        return this;
    }

    /**
     * <p>
     * The encryption configuration. If no value is specified, the default is no encryption.
     * </p>
     * 
     * @param encryptionConfiguration
     *        The encryption configuration. If no value is specified, the default is no encryption.
     */

    public void setEncryptionConfiguration(EncryptionConfiguration encryptionConfiguration) {
        this.encryptionConfiguration = encryptionConfiguration;
    }

    /**
     * <p>
     * The encryption configuration. If no value is specified, the default is no encryption.
     * </p>
     * 
     * @return The encryption configuration. If no value is specified, the default is no encryption.
     */

    public EncryptionConfiguration getEncryptionConfiguration() {
        return this.encryptionConfiguration;
    }

    /**
     * <p>
     * The encryption configuration. If no value is specified, the default is no encryption.
     * </p>
     * 
     * @param encryptionConfiguration
     *        The encryption configuration. If no value is specified, the default is no encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExtendedS3DestinationDescription withEncryptionConfiguration(EncryptionConfiguration encryptionConfiguration) {
        setEncryptionConfiguration(encryptionConfiguration);
        return this;
    }

    /**
     * <p>
     * The CloudWatch logging options for your delivery stream.
     * </p>
     * 
     * @param cloudWatchLoggingOptions
     *        The CloudWatch logging options for your delivery stream.
     */

    public void setCloudWatchLoggingOptions(CloudWatchLoggingOptions cloudWatchLoggingOptions) {
        this.cloudWatchLoggingOptions = cloudWatchLoggingOptions;
    }

    /**
     * <p>
     * The CloudWatch logging options for your delivery stream.
     * </p>
     * 
     * @return The CloudWatch logging options for your delivery stream.
     */

    public CloudWatchLoggingOptions getCloudWatchLoggingOptions() {
        return this.cloudWatchLoggingOptions;
    }

    /**
     * <p>
     * The CloudWatch logging options for your delivery stream.
     * </p>
     * 
     * @param cloudWatchLoggingOptions
     *        The CloudWatch logging options for your delivery stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExtendedS3DestinationDescription withCloudWatchLoggingOptions(CloudWatchLoggingOptions cloudWatchLoggingOptions) {
        setCloudWatchLoggingOptions(cloudWatchLoggingOptions);
        return this;
    }

    /**
     * <p>
     * The data processing configuration.
     * </p>
     * 
     * @param processingConfiguration
     *        The data processing configuration.
     */

    public void setProcessingConfiguration(ProcessingConfiguration processingConfiguration) {
        this.processingConfiguration = processingConfiguration;
    }

    /**
     * <p>
     * The data processing configuration.
     * </p>
     * 
     * @return The data processing configuration.
     */

    public ProcessingConfiguration getProcessingConfiguration() {
        return this.processingConfiguration;
    }

    /**
     * <p>
     * The data processing configuration.
     * </p>
     * 
     * @param processingConfiguration
     *        The data processing configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExtendedS3DestinationDescription withProcessingConfiguration(ProcessingConfiguration processingConfiguration) {
        setProcessingConfiguration(processingConfiguration);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 backup mode.
     * </p>
     * 
     * @param s3BackupMode
     *        The Amazon S3 backup mode.
     * @see S3BackupMode
     */

    public void setS3BackupMode(String s3BackupMode) {
        this.s3BackupMode = s3BackupMode;
    }

    /**
     * <p>
     * The Amazon S3 backup mode.
     * </p>
     * 
     * @return The Amazon S3 backup mode.
     * @see S3BackupMode
     */

    public String getS3BackupMode() {
        return this.s3BackupMode;
    }

    /**
     * <p>
     * The Amazon S3 backup mode.
     * </p>
     * 
     * @param s3BackupMode
     *        The Amazon S3 backup mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3BackupMode
     */

    public ExtendedS3DestinationDescription withS3BackupMode(String s3BackupMode) {
        setS3BackupMode(s3BackupMode);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 backup mode.
     * </p>
     * 
     * @param s3BackupMode
     *        The Amazon S3 backup mode.
     * @see S3BackupMode
     */

    public void setS3BackupMode(S3BackupMode s3BackupMode) {
        this.s3BackupMode = s3BackupMode.toString();
    }

    /**
     * <p>
     * The Amazon S3 backup mode.
     * </p>
     * 
     * @param s3BackupMode
     *        The Amazon S3 backup mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3BackupMode
     */

    public ExtendedS3DestinationDescription withS3BackupMode(S3BackupMode s3BackupMode) {
        setS3BackupMode(s3BackupMode);
        return this;
    }

    /**
     * <p>
     * The configuration for backup in Amazon S3.
     * </p>
     * 
     * @param s3BackupDescription
     *        The configuration for backup in Amazon S3.
     */

    public void setS3BackupDescription(S3DestinationDescription s3BackupDescription) {
        this.s3BackupDescription = s3BackupDescription;
    }

    /**
     * <p>
     * The configuration for backup in Amazon S3.
     * </p>
     * 
     * @return The configuration for backup in Amazon S3.
     */

    public S3DestinationDescription getS3BackupDescription() {
        return this.s3BackupDescription;
    }

    /**
     * <p>
     * The configuration for backup in Amazon S3.
     * </p>
     * 
     * @param s3BackupDescription
     *        The configuration for backup in Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExtendedS3DestinationDescription withS3BackupDescription(S3DestinationDescription s3BackupDescription) {
        setS3BackupDescription(s3BackupDescription);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRoleARN() != null)
            sb.append("RoleARN: ").append(getRoleARN()).append(",");
        if (getBucketARN() != null)
            sb.append("BucketARN: ").append(getBucketARN()).append(",");
        if (getPrefix() != null)
            sb.append("Prefix: ").append(getPrefix()).append(",");
        if (getBufferingHints() != null)
            sb.append("BufferingHints: ").append(getBufferingHints()).append(",");
        if (getCompressionFormat() != null)
            sb.append("CompressionFormat: ").append(getCompressionFormat()).append(",");
        if (getEncryptionConfiguration() != null)
            sb.append("EncryptionConfiguration: ").append(getEncryptionConfiguration()).append(",");
        if (getCloudWatchLoggingOptions() != null)
            sb.append("CloudWatchLoggingOptions: ").append(getCloudWatchLoggingOptions()).append(",");
        if (getProcessingConfiguration() != null)
            sb.append("ProcessingConfiguration: ").append(getProcessingConfiguration()).append(",");
        if (getS3BackupMode() != null)
            sb.append("S3BackupMode: ").append(getS3BackupMode()).append(",");
        if (getS3BackupDescription() != null)
            sb.append("S3BackupDescription: ").append(getS3BackupDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExtendedS3DestinationDescription == false)
            return false;
        ExtendedS3DestinationDescription other = (ExtendedS3DestinationDescription) obj;
        if (other.getRoleARN() == null ^ this.getRoleARN() == null)
            return false;
        if (other.getRoleARN() != null && other.getRoleARN().equals(this.getRoleARN()) == false)
            return false;
        if (other.getBucketARN() == null ^ this.getBucketARN() == null)
            return false;
        if (other.getBucketARN() != null && other.getBucketARN().equals(this.getBucketARN()) == false)
            return false;
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        if (other.getBufferingHints() == null ^ this.getBufferingHints() == null)
            return false;
        if (other.getBufferingHints() != null && other.getBufferingHints().equals(this.getBufferingHints()) == false)
            return false;
        if (other.getCompressionFormat() == null ^ this.getCompressionFormat() == null)
            return false;
        if (other.getCompressionFormat() != null && other.getCompressionFormat().equals(this.getCompressionFormat()) == false)
            return false;
        if (other.getEncryptionConfiguration() == null ^ this.getEncryptionConfiguration() == null)
            return false;
        if (other.getEncryptionConfiguration() != null && other.getEncryptionConfiguration().equals(this.getEncryptionConfiguration()) == false)
            return false;
        if (other.getCloudWatchLoggingOptions() == null ^ this.getCloudWatchLoggingOptions() == null)
            return false;
        if (other.getCloudWatchLoggingOptions() != null && other.getCloudWatchLoggingOptions().equals(this.getCloudWatchLoggingOptions()) == false)
            return false;
        if (other.getProcessingConfiguration() == null ^ this.getProcessingConfiguration() == null)
            return false;
        if (other.getProcessingConfiguration() != null && other.getProcessingConfiguration().equals(this.getProcessingConfiguration()) == false)
            return false;
        if (other.getS3BackupMode() == null ^ this.getS3BackupMode() == null)
            return false;
        if (other.getS3BackupMode() != null && other.getS3BackupMode().equals(this.getS3BackupMode()) == false)
            return false;
        if (other.getS3BackupDescription() == null ^ this.getS3BackupDescription() == null)
            return false;
        if (other.getS3BackupDescription() != null && other.getS3BackupDescription().equals(this.getS3BackupDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleARN() == null) ? 0 : getRoleARN().hashCode());
        hashCode = prime * hashCode + ((getBucketARN() == null) ? 0 : getBucketARN().hashCode());
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        hashCode = prime * hashCode + ((getBufferingHints() == null) ? 0 : getBufferingHints().hashCode());
        hashCode = prime * hashCode + ((getCompressionFormat() == null) ? 0 : getCompressionFormat().hashCode());
        hashCode = prime * hashCode + ((getEncryptionConfiguration() == null) ? 0 : getEncryptionConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchLoggingOptions() == null) ? 0 : getCloudWatchLoggingOptions().hashCode());
        hashCode = prime * hashCode + ((getProcessingConfiguration() == null) ? 0 : getProcessingConfiguration().hashCode());
        hashCode = prime * hashCode + ((getS3BackupMode() == null) ? 0 : getS3BackupMode().hashCode());
        hashCode = prime * hashCode + ((getS3BackupDescription() == null) ? 0 : getS3BackupDescription().hashCode());
        return hashCode;
    }

    @Override
    public ExtendedS3DestinationDescription clone() {
        try {
            return (ExtendedS3DestinationDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}