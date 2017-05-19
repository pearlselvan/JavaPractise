package AnnodationDemo;

/*-------------------------------------------------------------------------------------------------------------------*\
|  Copyright (C) 2014-15 PayPal                                                                                       |
|                                                                                                                     |
|  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance     |
|  with the License.                                                                                                  |
|                                                                                                                     |
|  You may obtain a copy of the License at                                                                            |
|                                                                                                                     |
|       http://www.apache.org/licenses/LICENSE-2.0                                                                    |
|                                                                                                                     |
|  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed   |
|  on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for  |
|  the specific language governing permissions and limitations under the License.                                     |
\*-------------------------------------------------------------------------------------------------------------------*/



/**
 * This class represents a basic test session.
 *
 */
public class BasicTestSession extends AbstractTestSession {
//    private static final SimpleLogger logger = SeLionLogger.getLogger();

//    @Override
//    public void startSession() {
//        setStarted(true);
//
//    }
//
//    @Override
//    public WebDriverPlatform getPlatform() {
//        logger.entering();
//        logger.exiting(WebDriverPlatform.UNDEFINED);
//        return WebDriverPlatform.UNDEFINED;
//    }

    @Override
    public void initializeTestSession(InvokedMethodInformation method) {
        this.initTestSession(method);

    }

//    @Override
//    public final void closeSession() {
//        logger.entering();
//        Grid.getThreadLocalWebDriver().set(null);
//        Grid.getThreadLocalTestSession().set(null);
//        Grid.getThreadLocalException().set(null);
//        setStarted(false);
//        logger.exiting();
//    }

}
