import os
import boto
from boto.s3.key import Key

print os.environ.get('myname')

def connectS3(aws_access_key,aws_secret_key):
    connector = boto.connect_s3(aws_access_key,aws_secret_key)
    return connector


def delete(filenameToDelete,bucketname):
    print "Deleting ",filenameToDelete
    bucket=connectS3('AKIAI4G5PI6KVC3W7A6Q','DVIwq8hIz7EisfqAzN34h0CZ7C4iTDl5jizdbzus').get_bucket(bucketname)
    print "connected",bucket
    k = Key(bucket,filenameToDelete)
    k.delete()


def upload():
    try:
        import boto
        from boto.s3.key import Key
        bucket_name = 'jaf-jar'
        print "bucket_name",bucket_name
        AWS_ACCESS_KEY_ID = 'AKIAI4G5PI6KVC3W7A6Q'
        AWS_SECRET_ACCESS_KEY = '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'
        print "key",AWS_ACCESS_KEY_ID
        conn = boto.connect_s3(AWS_ACCESS_KEY_ID,AWS_SECRET_ACCESS_KEY)
        print "connect",conn
        bucket = conn.get_bucket(bucket_name)
        print "bucket list",bucket.list()
        # go through each version of the file
        key = '%s.png' % id

        fn ='../../../build/libs/codeGym-1.0.jar'
        print "File name ",fn
        # create a key to keep track of our file in the storage
        k = Key(bucket)
        print "Key"
        # k.key = 'myfile.txt'
        k.key = 'codeGym-1.0.jar'
        print "Key1"
        k.set_contents_from_filename(fn)
        print "Key2"
        # we need to make it public so it can be accessed publicly
        # using a URL like http://s3.amazonaws.com/bucket_name/key
        k.make_public()
        print "Key3"
        # remove the file from the web server
        os.remove(fn)
    except:
        print('An error occured.')

# upload()
# delete("codeGym-1.0.jar","jaf-jar")




