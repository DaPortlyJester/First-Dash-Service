package org.technojays.first.inject;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.Singleton;
import org.technojays.first.service.TeamService;
import org.technojays.first.service.jooq.JQTeamService;

/**
 * @author Derelle.Redmond
 * @since 2/14/2015.
 */
public class DashModule implements Module {
    @Override
    public void configure(Binder binder) {
        binder.bind(TeamService.class).to(JQTeamService.class).in(Singleton.class);
    }
}
