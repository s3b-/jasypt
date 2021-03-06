/*
 * =============================================================================
 * 
 *   Copyright (c) 2007-2010, The JASYPT team (http://www.jasypt.org)
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 * 
 * =============================================================================
 */
package org.jasypt.encryption.pbe;


/**
 * <p>
 * Common interface for all Password Based Encryptors which receive a 
 * String message and return a String result, and provide means
 * to set passwords as <i>cleanable</i> char[] objects (instead of
 * immutable Strings).
 * <p>
 * For a default implementation, see {@link StandardPBEStringEncryptor}.
 * </p>
 * 
 * @since 1.8
 * 
 * @author Daniel Fern&aacute;ndez
 * 
 */
public interface PBEStringCleanablePasswordEncryptor extends PBEStringEncryptor, CleanablePasswordBased {

    // aggregator interface
    
}
