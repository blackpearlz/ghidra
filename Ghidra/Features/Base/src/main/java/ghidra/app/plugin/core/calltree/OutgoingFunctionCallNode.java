/* ###
 * IP: GHIDRA
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ghidra.app.plugin.core.calltree;

import ghidra.program.model.address.Address;
import ghidra.program.model.listing.Function;
import ghidra.program.model.listing.Program;

public class OutgoingFunctionCallNode extends OutgoingCallNode {

	OutgoingFunctionCallNode(Program program, Function function, Address sourceAddress,
			CallTreeOptions callTreeOptions) {
		super(program, function, sourceAddress, CallTreePlugin.FUNCTION_ICON, callTreeOptions);
	}

	@Override
	CallNode recreate() {
		return new OutgoingFunctionCallNode(program, function, getSourceAddress(), callTreeOptions);
	}
}
