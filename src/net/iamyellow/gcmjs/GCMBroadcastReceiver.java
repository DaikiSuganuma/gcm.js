//
//   Copyright 2013 jordi domenech <http://iamyellow.net, jordi@iamyellow.net>
//
//   Licensed under the Apache License, Version 2.0 (the "License");
//   you may not use this file except in compliance with the License.
//   You may obtain a copy of the License at
//
//       http://www.apache.org/licenses/LICENSE-2.0
//
//   Unless required by applicable law or agreed to in writing, software
//   distributed under the License is distributed on an "AS IS" BASIS,
//   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//   See the License for the specific language governing permissions and
//   limitations under the License.
//

package net.iamyellow.gcmjs;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

import net.iamyellow.gcmjs.GCMIntentService;

public class GCMBroadcastReceiver extends android.support.v4.content.WakefulBroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		ComponentName comp = new ComponentName(context.getPackageName(),
			GCMIntentService.class.getName());

		startWakefulService(context, (intent.setComponent(comp)));

		// @see http://stackoverflow.com/questions/23835970/broadcastreceiver-trying-to-return-result-during-a-non-ordered-broadcast-packa
		//setResultCode(Activity.RESULT_OK);
	}

}
