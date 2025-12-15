from oeqa.runtime.case import OERuntimeTestCase
from oeqa.core.decorator.depends import OETestDepends

class MyAppTest(OERuntimeTestCase):

    @OETestDepends(['ssh.SSHTest.test_ssh'])
    def test_service_running(self):
        (status, output) = self.target.run('uname -r')
        self.assertEqual(status, 0, msg=f"Status: {status}, Output: {output}")
        self.assertEqual(output.strip(), "6.6.111-yocto-standard")

